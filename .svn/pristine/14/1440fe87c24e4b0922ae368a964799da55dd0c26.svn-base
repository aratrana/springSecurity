package com.arat.budget.command;

import com.arat.budget.utils.SpringContextHelper;

public abstract class BaseCommand {

	protected static final String USER_MANAGEMENT_SERVICE = "userManagementService";
	protected static final String AUTH_SERVICE = "authService";
	private String actionType;

	public BaseCommand() {
		super();
		this.actionType = null;
	}

	public abstract void execute();

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	@SuppressWarnings("unchecked")
	public <T> T getBean(String name) {
		return (T) SpringContextHelper.getContext().getBean(name);
	}
}
