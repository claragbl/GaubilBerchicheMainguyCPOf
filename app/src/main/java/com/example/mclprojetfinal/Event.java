package com.example.mclprojetfinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Event {

    // création des attributs:

    String eventName;
    Date departureTime;
    int maxDrinkCount;
    int drinkCount;
    int freshScore;
    ArrayList<Chalenge> chalenges; //liste des n chalenges


    // création des méthodes:

    //contructeur Event: prend la liste des challenges en entrée pour pouvoir tester la fraicheur
    //de la personne à un moment donné. Le constructeur stocke la liste dans un des attribut de la
    //classe

    public Event(ArrayList<Chalenge> chalengeList, String name, Date aDepartureTime, int aMaxDrinkCount) {
        chalenges = chalengeList;
        eventName = name;
        departureTime = aDepartureTime;
        maxDrinkCount = aMaxDrinkCount;
        Timer departureTimer = new Timer();
        departureTimer.schedule(new TimerTask() { //schedule: quand on arrive departureTime,
            @Override                             // schedule lance la méthode run de la TT -> dans
            public void run() {                   // run on appelle notifyNeedLeave
                notifyNeedLeave();
            }
        }, departureTime);
    }

    public void addDrink() {
        drinkCount = drinkCount + 1;
    }

    //méthode qui est appelée dans Event et qui s'exécute quand le timer est arrivé à departure time
    private void notifyNeedLeave () {
        //appeler la popup/la notification
    }



}




