package com.example.recyclerapi;

import java.io.Serializable;
import java.util.List;

public class Msg implements Serializable {

    private String status;
    private ResultBean result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }


    public static class ResultBean implements Serializable {

        private HourlyBean hourly;

        public HourlyBean getHourly() {
            return hourly;
        }

        public void setHourly(HourlyBean hourly) {
            this.hourly = hourly;
        }

        public static class HourlyBean implements Serializable {

            private List<WindBean> wind;

            public List<WindBean> getWind() {
                return wind;
            }

            public void setWind(List<WindBean> wind) {
                this.wind = wind;
            }

            public static class WindBean implements Serializable {
                /**
                 * datetime : 2021-06-09T21:00+08:00
                 * speed : 55.8
                 * direction : 315.0
                 */

                private String datetime;
                private double speed;
                private String direction;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
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
    }
}
