package entities.concretes;

import entities.abstracts.Entity;

public class Order implements Entity {
	private int id;
	private int gameId;
	private int campaignId;
	
	public Order() {
		
	}

	public Order(int id, int gameId, int campaignId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

}


