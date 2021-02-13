=================================================================

# ipi-MESI-projet
projet Mise En SItuation

=================================================================

Trello
https://trello.com/b/ErIOzJsQ/rpg

=================================================================

## Connexion à la Base de données

* Copier le fichier application.properties contenu dans le dossier fichiers complémentaires

* Et coller le à la racine du dossier resources :
```
>rpg
    ...
    >src
        >main
            ...
            >resources
                application.properties
```

* Modifier les lignes :
```
spring.datasource.username= #votre identifiant à la Base de Données
spring.datasource.password= #votre mot de passe à la Base de Données
```
Avec vos informations

* Faites un build 

* Lancer l'application avec le fichier : RpgApplication
contenu dans 
```
>rpg
    ...
    >src
        >main
            >java
                >com.ldvelh.rpg
                    application.properties
```

Votre Base de Données est désormais accessible.