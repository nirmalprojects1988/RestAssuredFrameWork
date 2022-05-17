package com.restassured.constants;

public final class Responsecodes {
	private Responsecodes() {}
	public static final int GET = 200;
    public static final int POST = 201;
    public static final int PUT = 200;
    public static final int DELETE = 204;//since reqres returns 204 as delete response code so i have added same response code
}
