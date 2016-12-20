package javaee;

/**
 * Created by desair4 on 12/13/2016.
 */
public class Intro {

    public static void main(String[] args) {
        //-------------------------Java EE------------------------------------
        //Web development

        //The more abstraction you have, easier to code !!
        //JEE - Java enterprise edition
        //Spring or Hibernate or anything that we learn from here on is Just reading its Documentation !!

        //JEE is collections of numerous technologies (frameworks, each trying to solve a different problem) which allow you to transfer information -> Db to user
        //JEE -> Comes out with JSR's -> Java specification
        //What is JSR specification ? Combination of Interfaces and Specification document.

        //Typically these specifications are implemented by the server -> So whoever is going to write a server, will implement them.
        //Typically we as client will just use the interface, and implementation will be provided by servers.

        //So for any server to be called 'JEE' compliant -> It needs to implement 'all' JSR's defined for web applications.

        //JEE web developement
        //It started with trying to build dynamic websites !!
        //Initially we only had html, js -> these both are 'static'

        //Servlets :
        //They are just normal classes (but kinda special !!)
        //They are special, because, server understands them, and knows how to deal with them.

        //you will extend some class
        //Then you will override few methods.
        //These methods will be called by server, when needed.
        //These methods will return a response to the server, and server will then return it to user.
        //service() //can be used to serve any http methods
        //doGet
        //doPost
        //doDelete etc. etc.


        //-------------------Diversion--------------------
        /*
        * Http request-response cycle
        *
        * Http : Has a set of methods that is used to communicate between browser and server
        * 1. Http methods
        * 2. Request and Response Headers
        * 3. Url, body, UrlParameters
        * 4. Http Status code
        *
        * When you make call to server, you need
        * 1. Address where you request should go
        * 2. Need information to pass to server ->
        *       a. UrlParameters (GET,DELETE)
        *       b. Body (POST, PUT)
        *
        *
        * Http Request-Response cycle:
        * 1. User say clicks on soemthing : This will make browser fire a 'http request'
        * 2. Request comes to the server
        * 3. Server then checks to see, to which application this request needs to forward along with data, headers etc.
        *       Server -|
        *               |- Application1     -> Mapping between url patterns and your application -> /application1/**    -> say this is JEE application
        *               |- Application2     -> Mapping between url patterns and your application -> /application2/**
        *               |- Application3     -> Mapping between url patterns and your application -> /application3/**
        *
        * 4. Application will then process and return response.
        * 5. If application is JEE application, then url is further mapped to specific servlet -> /account/** : 'AccountServlet'  (entire url could be somehing like : www.domain.com/Application1/account/sdsddsdsd/sdsdsds/sdsd)
        * 6. Within the servlet, server checks what is the http method type, and then calls corresponding do** method for e.g. if http method was 'GET' it will call 'doGet'
        * */

        /*
        *   We extend JEE specs class -> override a specific method -> JEE server 'knows' when to call what method.
        * */


    }
}