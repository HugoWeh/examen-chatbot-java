Fait avec Intellij

## 1. Cloner le projet

## 2. Ouvrir les projets

Ouvrez les deux projets séparément pour que les projets Maven soient correctement reconnus.

## 3. Créer la base de données

Créez la base de données `exam_java` :

```sql
CREATE DATABASE exam_java;

USE exam_java;

DROP TABLE IF EXISTS bot;

CREATE TABLE bot (
    id INT AUTO_INCREMENT PRIMARY KEY,
    response VARCHAR(200)
);

INSERT INTO bot (response) VALUES
    ('La vie est un mystère qu\'il faut vivre, et non un problème à résoudre. - Gandhi'),
    ('Il n\'y a pas de chemin vers le bonheur. Le bonheur est le chemin. - Bouddha'),
    ('La seule façon de faire du bon travail est d\'aimer ce que vous faites. - Steve Jobs'),
    ('Le voyage est une récompense en soi. - Proverbe chinois'),
    ('Le succès consiste à aller d\'échec en échec sans perdre son enthousiasme. - Winston Churchill'),
    ('Rien n\'est impossible, l\'impossible prend juste un peu plus de temps.'),
    ('Tout ce dont nous avons besoin, c\'est d\'un peu de folie et de beaucoup de patience.'),
    ('Le temps est la chose la plus précieuse que nous ayons, ne le gaspille pas.'),
    ('Vivre dans l\'instant présent est le seul moyen de goûter pleinement à la vie.'),
    ('Les rêves n\'ont pas de limite, c\'est nous qui mettons des barrières.'),
    ('Il est plus facile de briser une petite habitude que d\'en prendre une grande.'),
    ('Le bonheur est une direction, pas une destination.'),
    ('Rien n\'est permanent, pas même nos soucis.'),
    ('Tout ce qui ne nous tue pas nous rend plus fort.'),
    ('La vie est un écho. Ce que tu envoies te revient.'),
    ('Les choses les plus simples sont souvent les meilleures.'),
    ('Le silence est une source de grande force.'),
    ('L\'échec est seulement l\'opportunité de recommencer de manière plus intelligente. - Henry Ford'),
    ('L\'amour ne se trouve pas, il se crée.'),
    ('Le vrai voyage ne consiste pas à chercher de nouveaux paysages, mais à avoir de nouveaux yeux. - Marcel Proust'),
    ('Il est toujours temps de changer. Le seul obstacle, c\'est de se convaincre qu\'il est trop tard.'),
    ('Tout est possible à celui qui ose rêver.'),
    ('Les petites choses de la vie rendent tout plus grand.'),
    ('Le bonheur ne dépend pas de ce que tu possèdes, mais de ce que tu ressens.'),
    ('Le meilleur reste toujours à venir.'),
    ('La paix intérieure commence par l\'acceptation de soi.'),
    ('L\'important n\'est pas de vivre, mais de bien vivre.'),
    ('Les rêves sont les étincelles de l\'âme.'),
    ('La vie est trop courte pour être sérieuse tout le temps.'),
    ('La simplicité est la sophistication suprême. - Léonard de Vinci'),
    ('Si tu ne te bats pas pour ce que tu veux, ne pleure pas pour ce que tu as perdu.'),
    ('Ton passé ne définit pas ton avenir.'),
    ('Ne rêve pas ta vie, vis tes rêves.'),
    ('La véritable richesse n\'est pas dans l\'argent, mais dans la liberté d\'être toi-même.'),
    ('La patience est une vertu, mais la persévérance est une force.'),
    ('C\'est dans les moments les plus difficiles que l\'on découvre nos vraies forces.'),
    ('L\'échec n\'est pas le contraire du succès, c\'est une partie de celui-ci.'),
    ('Il faut savoir profiter des petits bonheurs de la vie.'),
    ('Fais ce que tu peux, avec ce que tu as, là où tu es.'),
    ('Le plus grand risque est de ne prendre aucun risque.'),
    ('Ne te compare pas aux autres, sois la meilleure version de toi-même.'),
    ('Ce qui ne nous tue pas nous rend plus fort.'),
    ('L\'espoir est la chose la plus forte pour surmonter n\'importe quelle difficulté.'),
    ('Les bonnes choses arrivent à ceux qui attendent, mais de meilleures choses arrivent à ceux qui agissent.'),
    ('Le bonheur, c\'est d\'avoir une vie que l\'on n\'a pas besoin de fuir.'),
    ('Les seules limites qui existent sont celles que tu t\'imposes.'),
    ('Il n\'y a pas de raccourci vers n\'importe où qui en vaille la peine.'),
    ('Quand tout semble aller contre toi, souviens-toi que l\'avion décolle contre le vent.'),
    ('On ne voit bien qu\'avec le cœur. L\'essentiel est invisible pour les yeux. - Antoine de Saint-Exupéry'),
    ('La beauté est dans les yeux de celui qui regarde.');
```

## 5. Lancer les 2 projets 

## 6. Ajouter un user en bdd INSERT INTO user (id, name) VALUES (0, 'user test');

## 7. Relancer exam-java-chatbot et aller sur localhost:8080
