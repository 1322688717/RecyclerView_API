package com.example.recyclerapi;


import java.util.List;

public class Msg_1 {
    public List<Wind> wind;

    public List<Wind> getWind() {
        return wind;
    }

    public void setWind(List<Wind> wind) {
        this.wind = wind;
    }

    public  static class Wind {
        public String datetime;
        public String speed;
        public String direction;

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }
    }
}
