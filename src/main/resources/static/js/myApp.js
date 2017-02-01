/**
 * Created by net_master on 19.05.2016.
 */
var app = angular.module('myApp', ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider

        .when("/agents", {
            templateUrl : "templates/agents.html",
            controller  : "AgentController"
        })

        .when("/documents", {
            templateUrl : "templates/documents.html",
            controller  : "DocumentController"
        })

        .when("/welcome", {
            templateUrl : "templates/welcome.html",
            controller  : "WelcomeController"
        })

        .otherwise({redirectTo: "/welcome"});
});

app.controller('AgentController', function($scope) {
    $scope.message = 'Hello from AgentController';
});

app.controller('DocumentController', function($scope) {
    $scope.message = 'Hello from DocumentController';
});

app.controller('WelcomeController', function($scope) {
    $scope.message = 'Hello from WelcomeController';
});