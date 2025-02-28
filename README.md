Fait avec Intellij

1. Cloner le projet

2. Séparer les 2 projets exam-java-chatbot et exam-java-endpoint pour que les projets Maven soient reconnus

3. Créer la base de de données exam_java

4. use exam_java;
drop table if exists bot;
create table bot (id int auto_increment primary key, response varchar(200));
INSERT INTO bot (response) VALUES ('La vie est un mystère qu\'il faut vivre, et non un problème à résoudre. - Gandhi');
INSERT INTO bot (response) VALUES ('Il n\'y a pas de chemin vers le bonheur. Le bonheur est le chemin. - Bouddha');
INSERT INTO bot (response) VALUES ('La seule façon de faire du bon travail est d\'aimer ce que vous faites. - Steve Jobs');
INSERT INTO bot (response) VALUES ('Le voyage est une récompense en soi. - Proverbe chinois');
INSERT INTO bot (response) VALUES ('Le succès consiste à aller d\'échec en échec sans perdre son enthousiasme. - Winston Churchill');
INSERT INTO bot (response) VALUES ('Rien n\'est impossible, l\'impossible prend juste un peu plus de temps.');
INSERT INTO bot (response) VALUES ('Tout ce dont nous avons besoin, c\'est d\'un peu de folie et de beaucoup de patience.');
INSERT INTO bot (response) VALUES ('Le temps est la chose la plus précieuse que nous ayons, ne le gaspille pas.');
INSERT INTO bot (response) VALUES ('Vivre dans l\'instant présent est le seul moyen de goûter pleinement à la vie.');
INSERT INTO bot (response) VALUES ('Les rêves n\'ont pas de limite, c\'est nous qui mettons des barrières.');
INSERT INTO bot (response) VALUES ('Il est plus facile de briser une petite habitude que d\'en prendre une grande.');
INSERT INTO bot (response) VALUES ('Le bonheur est une direction, pas une destination.');
INSERT INTO bot (response) VALUES ('Rien n\'est permanent, pas même nos soucis.');
INSERT INTO bot (response) VALUES ('Tout ce qui ne nous tue pas nous rend plus fort.');
INSERT INTO bot (response) VALUES ('La vie est un écho. Ce que tu envoies te revient.');
INSERT INTO bot (response) VALUES ('Les choses les plus simples sont souvent les meilleures.');
INSERT INTO bot (response) VALUES ('Le silence est une source de grande force.');
INSERT INTO bot (response) VALUES ('L\'échec est seulement l\'opportunité de recommencer de manière plus intelligente. - Henry Ford');
INSERT INTO bot (response) VALUES ('L\'amour ne se trouve pas, il se crée.');
INSERT INTO bot (response) VALUES ('Le vrai voyage ne consiste pas à chercher de nouveaux paysages, mais à avoir de nouveaux yeux. - Marcel Proust');
INSERT INTO bot (response) VALUES ('Il est toujours temps de changer. Le seul obstacle, c\'est de se convaincre qu\'il est trop tard.');
INSERT INTO bot (response) VALUES ('Tout est possible à celui qui ose rêver.');
INSERT INTO bot (response) VALUES ('Les petites choses de la vie rendent tout plus grand.');
INSERT INTO bot (response) VALUES ('Le bonheur ne dépend pas de ce que tu possèdes, mais de ce que tu ressens.');
INSERT INTO bot (response) VALUES ('Le meilleur reste toujours à venir.');
INSERT INTO bot (response) VALUES ('La paix intérieure commence par l\'acceptation de soi.');
INSERT INTO bot (response) VALUES ('L\'important n\'est pas de vivre, mais de bien vivre.');
INSERT INTO bot (response) VALUES ('Les rêves sont les étincelles de l\'âme.');
INSERT INTO bot (response) VALUES ('La vie est trop courte pour être sérieuse tout le temps.');
INSERT INTO bot (response) VALUES ('La simplicité est la sophistication suprême. - Léonard de Vinci');
INSERT INTO bot (response) VALUES ('Si tu ne te bats pas pour ce que tu veux, ne pleure pas pour ce que tu as perdu.');
INSERT INTO bot (response) VALUES ('Ton passé ne définit pas ton avenir.');
INSERT INTO bot (response) VALUES ('Ne rêve pas ta vie, vis tes rêves.');
INSERT INTO bot (response) VALUES ('La véritable richesse n\'est pas dans l\'argent, mais dans la liberté d\'être toi-même.');
INSERT INTO bot (response) VALUES ('La patience est une vertu, mais la persévérance est une force.');
INSERT INTO bot (response) VALUES ('C\'est dans les moments les plus difficiles que l\'on découvre nos vraies forces.');
INSERT INTO bot (response) VALUES ('L\'échec n\'est pas le contraire du succès, c\'est une partie de celui-ci.');
INSERT INTO bot (response) VALUES ('Il faut savoir profiter des petits bonheurs de la vie.');
INSERT INTO bot (response) VALUES ('Fais ce que tu peux, avec ce que tu as, là où tu es.');
INSERT INTO bot (response) VALUES ('Le plus grand risque est de ne prendre aucun risque.');
INSERT INTO bot (response) VALUES ('Ne te compare pas aux autres, sois la meilleure version de toi-même.');
INSERT INTO bot (response) VALUES ('Ce qui ne nous tue pas nous rend plus fort.');
INSERT INTO bot (response) VALUES ('L\'espoir est la chose la plus forte pour surmonter n\'importe quelle difficulté.');
INSERT INTO bot (response) VALUES ('Les bonnes choses arrivent à ceux qui attendent, mais de meilleures choses arrivent à ceux qui agissent.');
INSERT INTO bot (response) VALUES ('Le bonheur, c\'est d\'avoir une vie que l\'on n\'a pas besoin de fuir.');
INSERT INTO bot (response) VALUES ('Les seules limites qui existent sont celles que tu t\'imposes.');
INSERT INTO bot (response) VALUES ('Il n\'y a pas de raccourci vers n\'importe où qui en vaille la peine.');
INSERT INTO bot (response) VALUES ('Quand tout semble aller contre toi, souviens-toi que l\'avion décolle contre le vent.');
INSERT INTO bot (response) VALUES ('On ne voit bien qu\'avec le cœur. L\'essentiel est invisible pour les yeux. - Antoine de Saint-Exupéry');
INSERT INTO bot (response) VALUES ('La beauté est dans les yeux de celui qui regarde.');
select * from bot;

5. Lancer les 2 projets 

6. Ajouter un user en bdd INSERT INTO user (id, name) VALUES (0, 'user test');

7. Relancer exam-java-chatbot et aller sur localhost:8080
