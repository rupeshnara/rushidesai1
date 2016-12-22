


User tries to access 

	1. LoginServlet -> /login/*
		1. /login (GET) -> shows login.html to enter userName, password -> /login (POST)
		2. /login (POST) -> authenticates user and redirects -> /account/accountSearch (GET)	//At this point user is authenticated
				1. I will remember the user1 was authenticated on server and give user a token.
				2. It's user's responsiblity to bring that token back to server evertyimte he makes a request or he will be considered not authenticated


	2. AccountServlet -> /account/*
		1. /account/accountSearch (GET) -> shows AccountSearch page -> submit to /account/getAccountDetails (POST)	//Also want to authenticate user here
				1. To authenctiate -> 1. Either remember the user was already authenticated
				2. Or ask him userName, password again
		2. /account/getAccountDetails -> Search account and show account data





SessionMap
	rk.browser1 -> 1234567:rk1=UserSession()
-------------------------------------------------
	rk.browser2 -> 1234567:rk2=UserSession()	

