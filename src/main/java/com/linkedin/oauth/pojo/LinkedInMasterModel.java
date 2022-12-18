package com.linkedin.oauth.pojo;


import com.linkedin.oauth.util.DateUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "master_data")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class LinkedInMasterModel {

	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

		@Column(name = "created_at")
		private String createdAt;

	    @Column(name = "lifecycle_status")
		private String lifecycleState;

		@Column(name = "last_modified_at")
		private String lastModifiedAt;

		@Column(name = "visibility")
		private String visibility;

		@Column(name = "published_at")
		private String publishedAt;

		@Column(name = "author")
		private String author;

		@Column(name = "u_id")
		private String uid;

		@Column(name = "commentary",length = 5000)
		private String commentary;

		@Column(name = "media_id")
		private String contentMediaId;

	  	@Column(name = "article_description", length = 1000)
		private String description;

		@Column(name = "article_thumbnail")
		private String thumbnail;

		@Column(name = "article_source", length = 1000)
		private String source;

		@Column(name = "article_title")
		private String title;

		@Column(name = "editable_by_author")
		private boolean isEditedByAuthor;

		public void setCreatedAt(Date date){
			this.createdAt = DateUtil.convertDateToWelkinFormat(date);
		}

		public void setPublishedAt(Date publishedAt){
			this.publishedAt = DateUtil.convertDateToWelkinFormat(publishedAt);
		}

		public void setLastModifiedAt(Date lastModifiedAt){
			this.lastModifiedAt = DateUtil.convertDateToWelkinFormat(lastModifiedAt);
		}



}
