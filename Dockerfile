# Utiliser l'image officielle Maven pour builder l'application
FROM maven:3.8.4-openjdk-17 AS build

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers pom.xml et télécharger les dépendances
COPY pom.xml .
RUN mvn dependency:go-offline

# Copier le code source et compiler l'application
COPY src ./src

# Exécuter les tests unitaires
RUN mvn test

RUN mvn clean package -DskipTests

# Utiliser une image Java légère pour exécuter l'application
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/simple-calculator-1.0-SNAPSHOT.jar app.jar

# Commande pour exécuter l'application
CMD ["java", "-jar", "app.jar"]
