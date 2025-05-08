
# 🔐 P-Gen — Générateur de mot de passe Java

Bienvenue sur **P-Gen**, un générateur de mots de passe aléatoires écrit en Java.  
Il vous permet de créer des mots de passe sécurisés en quelques secondes via un terminal.

---

## ✨ Fonctionnalités

- Définir la **longueur** du mot de passe (entre 8 et 16 caractères)
- Choisir d’inclure :
  - ✅ Lettres majuscules
  - ✅ Lettres minuscules
  - ✅ Caractères spéciaux
- Génération aléatoire à partir des critères choisis
- Possibilité de quitter le programme à tout moment avec `quit`
- Interface console simple et interactive
- Design ASCII décoratif 🎨

---

## 🖥️ Interface Graphique en Cours de Développement
Une **interface graphique (GUI)** est actuellement en cours de développement pour améliorer l'expérience utilisateur. L'interface permettra de générer des mots de passe de manière encore plus intuitive et accessible. Plus d'infos à venir !

---

## 🛠️ Utilisation

### ✅ Prérequis

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 8 ou supérieure)
- Un terminal / console

### ▶️ Lancer le programme

1. Compilez le fichier `PGen.java` :
   ```bash
   javac PGen.java
2. Exécutez le fichier :
   ```bash
   java PGen
3. Vous pouvez quitter le programme à tout moment en tapant 'quit'

## 📷 Aperçu
  ### Page d'accueil
  ```bash
=================================================================  
     _____               _______      ________  ______    ___      
    |  __ \\            / /____//    ||_____/_/ | | \ \  | | | 
    | |__) ||  _____   / / ______    |||____    | | |\ \ | | |   
    |  ___//  /__/_/  | |  \___ \ \  ||___||    | | | \ \| | |
    | ||              \ \______| | | |||_____   | | |  \ \ | | 
    |_||               \________/_/  ||_____\_\ |_|/    \__|_/ 

=================================================================  
                      Password Generator                           
=================================================================  

Bienvenue sur P-Gen,
Ceci est un générateur de mot de passe aléatoire.

Pour l'utiliser c'est très simple, laissez vous guider.
Cela ne prend que quelques secondes !

A tout moment, tapez 'quit' pour quitter ce programme.

-----------------------------------------------------------------
  ```
  ### Utilisation
  ```bash
  Définissez le nombre de caractères à inclure dans le mot de passe: 12
  Inclure des lettres majuscules? (oui/non): oui
  Inclure des lettres minuscules? (oui/non): oui
  Inclure des caractères spéciaux? (oui/non): non
  
  =========================================================
  
  -----> Voici votre mot de passe : aQ3bT7wUeK1Z <-----
  
  =========================================================
  ```
  PS : Le Mot de passe contiendra par défaut des chiffres.
  
Développé par Antoninl94
