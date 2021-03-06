package com.example.autclub.AppModel;

import com.google.gson.annotations.SerializedName;

/**
 * The Club class contain club information.
 */
public class Club{
    @SerializedName("connectID")
    private int connectID;

    @SerializedName("clubID")
    private int clubID;

    @SerializedName("name")
    private String name;

    private int image;

    @SerializedName("description")
    private String description;

    @SerializedName("tokens")
    private String tokens;

    @SerializedName("followStatus")
    private boolean followStatus;

    @SerializedName("joinStatus")
    private boolean joinStatus;

    /**
     * The constructor to create a new Club.
     */
    public Club() {
    }

    /**
     * The constructor to create a new Club.
     *
     * @param name  the club name
     * @param image the club image icon
     */
    public Club(String name, int image) {
        this.name = name;
        this.image = image;
    }

    /**
     * The constructor to create a new Club.
     *
     * @param clubID the club id
     * @param name   the club name
     * @param tokens the club fb api tokens
     */
    public Club(int clubID, String name, String tokens) {
        setClubID(clubID);
        setName(name);
        setTokens(tokens);
    }

    public int getConnectID() {
        return connectID;
    }

    public void setConnectID(int connectID) {
        this.connectID = connectID;
    }

    /**
     * Gets club id.
     *
     * @return the club id
     */
    public int getClubID() {
        return clubID;
    }

    /**
     * Sets club id.
     *
     * @param clubID the club id
     */
    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public int getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(int image) {
        this.image = image;
    }

    /**
     * Gets tokens.
     *
     * @return the tokens
     */
    public String getTokens() {
        return tokens;
    }

    /**
     * Sets tokens.
     *
     * @param tokens the tokens
     */
    public void setTokens(String tokens) {
        this.tokens = tokens;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFollowStatus() {
        return followStatus;
    }

    public void setChangeFollowStatus() {
        if(this.isFollowStatus()){
            this.followStatus = false;
        }else{
            this.followStatus = true;
        }
    }

    public boolean isJoinStatus() {
        return joinStatus;
    }

    public void setChangeJoinStatus() {
        if(this.isJoinStatus()){
            this.joinStatus = false;
        }else{
            this.joinStatus = true;
        }
    }

    @Override
    public String toString() {
        return "Club{" + clubID + ", " + name + ",\n " + description + "\n " + tokens + "\n" +
                ", followStatus=" + followStatus +
                ", joinStatus=" + joinStatus +
                "}\n";
    }

}
