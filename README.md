
# Sports Players Card Game 

When we were kids, we played with cards like pokemon, sports etc. with each other. In this project, you can play that as a digital version of this game. There are two opponents, user and the computer and who gets the best score wins. 

Developed in 2020.

## Table of contents
* [General info](#general-info)
* [Technologies-Tools](#technologies-tools)
* [Modules](#modules)
* [Setup](#setup)
* [Contact](#contact)


## General Info


In the project, there are 2 opponents as user and the computer. We have 16 cards to deal out this players. 8 of them are football players and the other 8 are basketball players. We deal this cards to players randomly for each game. Eight cards ( 4 football - 4 basketball ) for each user. 

This sports players have 3 attributes:

For the football players:

- Penalty
- Free-kick
- Facing the goalkeeper

For the basketball players: 

- Two Point Shoot
- Three Point Shoot
- Free Throw

Each player has their own score for this attributes. In each round, user selects a player which wants to play and compared to the random choice of computer card. The attribute that will compared is randomly chosen. Who has more score for this attribute gets the points. In every rounds the card type that will compared changes to other.
	
![Choose Page](https://github.com/alibariszengin/Who-Is-The-Croupier/blob/main/img/choose.png?raw=true)
	
As you can see, after the users choice, there is a random score compare as penalty. With 85-75 score diff, user get the points.
![Fight Page](https://github.com/alibariszengin/Who-Is-The-Croupier/blob/main/img/fight.png?raw=true)
After the compare, the points added to user score and displays the updated score. 
![Score Change Page](https://github.com/alibariszengin/Who-Is-The-Croupier/blob/main/img/score_change.png?raw=true)

And finally after all the cards played, game shows the total scores of players and displays the higher score as the winner.
![Score Change Page](https://github.com/alibariszengin/Who-Is-The-Croupier/blob/main/img/finish.png?raw=true)
## Technologies-Tools
Project is created with:
* Java 15
* Intellij Idea

## Modules
There are 2 interfaces as *Sport Player Card* and *Player*. These interfaces implemented from *Footboll Player* - *Basketball Player* as *Sport Player Card* and *User* - *Computer* as *Player*.

## Setup
To run this project, open the project with your IDE and run the Test class. 

## Contact

Ali Barış Zengin  -  [alibariszengin@gmail.com](mailto:alibariszengin@gmail.com)

Project Link:  [https://github.com/alibariszengin/Who-Is-The-Croupier](https://github.com/alibariszengin/Who-Is-The-Croupier)
