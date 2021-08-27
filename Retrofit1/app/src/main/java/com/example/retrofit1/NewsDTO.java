package com.example.retrofit1;

import java.io.Serializable;

public class NewsDTO implements Serializable {
	private String headline;
	private String details;
	private String time;
	private String commentId;
	private String userId;
	private int replies;
	private String avatarUrl;

	public void setHeadline(String headline){
		this.headline = headline;
	}

	public String getHeadline(){
		return headline;
	}

	public void setDetails(String details){
		this.details = details;
	}

	public String getDetails(){
		return details;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	public void setCommentId(String commentId){
		this.commentId = commentId;
	}

	public String getCommentId(){
		return commentId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setReplies(int replies){
		this.replies = replies;
	}

	public int getReplies(){
		return replies;
	}

	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	@Override
 	public String toString(){
		return 
			"NewsDTO{" + 
			"headline = '" + headline + '\'' + 
			",details = '" + details + '\'' + 
			",time = '" + time + '\'' + 
			",comment_id = '" + commentId + '\'' + 
			",user_id = '" + userId + '\'' + 
			",replies = '" + replies + '\'' + 
			",avatar_url = '" + avatarUrl + '\'' + 
			"}";
		}
}