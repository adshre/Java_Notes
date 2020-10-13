# Spring Framework

Java Frameworks : Jsf, struts, hibernet, spring, etc.

## Spring Framework :
* Spring is complete and modular framework for developing enterprise applications.
* It can be used for development of particular layer of real time application.
* It can be used for implemention of all layers of real time application.

## Features :
* open source
* light weight
* Simplicity - uses POJO or POJI(Plain Old Java Intefaces)
* Testability - has unit testing layer
* Loose Coupling  
* framework of framwork - ex : hiberante integration present
* array of resources : mvc, unit testing , etc

## Disadvantage :
* Use api as it is, restriction
* code is public
* api technology not exposed hence custome built


## Spring Architecture :
<img src="https://github.com/adshre/Java_Notes/blob/main/blob/spring_architecture.png" width="400" height="256" title="Collection Logo">

* core layer :
    1. provides dependency injection and Inversion of Control
    2. provides fundamental parts of framework
    3. Bean module provides BeanFactory, which is a sophisticated implementation of the factory pattern.
    4. Context module is a medium to access any objects defined and configured. 
* Data Access/Integration layer consists of the JDBC, ORM, OXM, JMS and Transaction modules 
* The Web layer consists of the Web, Web-MVC, Web-Socket, and Web-Portlet modules

## IoC Container : 
* The objects that form the backbone of your application and that are managed by the Spring IoC container are called beans.
* The container will create the bean, wire them together, configure them, and manage their complete life cycle from creation till destruction.
* The Spring IoC container makes use of Java POJO classes and configuration metadata to produce a fully configured and executable system or application.
* Two distinct types of containers : Spring BeanFactory Container and Spring ApplicationContext Container(The ApplicationContext container includes all functionality of the BeanFactorycontainer, so it is generally recommended over BeanFactory.)
* *Note : Application Context creates bean even when not requested but not bean factory, 
i.e at ApplicationContextcontext = new ClassPathApplicationontext(xmlFile.xml) and beanFactory at factory.getBean()*

## Dependency Injection : 
* Dependency Injection (or sometime called wiring) helps in gluing these classes together and at the same time keeping them independent.(loosely coupled)
* Constructor-based and Setter-based DI

## AOP(Aspect Oriented Programming):
* Aspect-Oriented Programming entails breaking down program logic into distinct parts called so-called concerns. 
* The functions that span multiple points of an application are called cross-cutting concerns and these cross-cutting concerns are conceptually separate from the application's business logic. 
* There are various common good examples of aspects like logging, auditing, declarative transactions, security, caching, etc.

## MVC(Model View Controller) :
* The Model encapsulates the application data and in general they will consist of POJO.
* The View is responsible for rendering the model data and in general it generates HTML output that the client's browser can interpret.
* The Controller is responsible for processing user requests and building an appropriate model and passes it to the view for rendering.
* The Spring Web model-view-controller (MVC) framework is designed around a DispatcherServlet that handles all the HTTP requests and responses. 
<img src="https://github.com/adshre/Java_Notes/blob/main/blob/spring_dispatcherservlet.png" width="400" height="256" title="Collection Logo">
