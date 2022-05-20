package fr.imsa.imsablablagateway.model;

import java.sql.Date;
import java.sql.Time;

public class Trajet {
	
    protected Integer id;

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }
    
	private Integer site;
    private String trajetType;
    private String localisation;
    private Date date;
    private Time dapartureTimeGone;
    private Time dapartureTimeReturn;
    private Integer price;
    private Integer placeRemaining;
    private Integer UserId;
    private String UserGroup;
    private Integer TravelTime;

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    
    public Integer getTravelTime() {
        return TravelTime;
    }


    public void setTravelTime(Integer travelTime) {
        this.TravelTime = travelTime;
    }


    public String getUserGroup() {
        return UserGroup;
    }


    public void setUserGroup(String userGroup) {
        this.UserGroup = userGroup;
    }


    public Integer getUserId() {
        return UserId;
    }


    public void setUserId(Integer userId) {
        this.UserId = userId;
    }


    public Integer getPlaceRemaining() {
        return placeRemaining;
    }


    public void setPlaceRemaining(Integer placeRemaining) {
        this.placeRemaining = placeRemaining;
    }


    public Integer getPrice() {
        return price;
    }


    public void setPrice(Integer price) {
        this.price = price;
    }


    public Time getDapartureTimeReturn() {
        return dapartureTimeReturn;
    }


    public void setDapartureTimeReturn(Time dapartureTimeReturn) {
        this.dapartureTimeReturn = dapartureTimeReturn;
    }


    public Time getDapartureTimeGone() {
        return dapartureTimeGone;
    }


    public void setDapartureTimeGone(Time dapartureTimeGone) {
        this.dapartureTimeGone = dapartureTimeGone;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getTrajetType() {
        return trajetType;
    }


    public void setTrajetType(String trajetType) {
        this.trajetType = trajetType;
    }


    public Integer getSite() {
        return site;
    }


    public void setSite(Integer site) {
        this.site = site;
    }

}
