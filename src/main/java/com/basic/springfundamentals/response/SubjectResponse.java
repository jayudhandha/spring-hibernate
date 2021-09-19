package com.basic.springfundamentals.response;

import com.basic.springfundamentals.model.SubjectModel;

public class SubjectResponse {

	private ApiStatus apiStatus;

	private int statusCode;

	private SubjectModel subjectModel;

	public SubjectResponse(ApiStatus apiStatus, int statusCode, SubjectModel subjectModel) {
		super();
		this.subjectModel = subjectModel;
		this.apiStatus = apiStatus;
		this.statusCode = statusCode;
	}

	public ApiStatus getApiStatus() {
		return apiStatus;
	}

	public void setApiStatus(ApiStatus apiStatus) {
		this.apiStatus = apiStatus;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public SubjectModel getSubjectModel() {
		return subjectModel;
	}

	public void setSubjectModel(SubjectModel subjectModel) {
		this.subjectModel = subjectModel;
	}

}
