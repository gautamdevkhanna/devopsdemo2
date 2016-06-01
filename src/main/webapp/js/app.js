'use strict';

// Declare app level module which depends on filters, and services
angular.module('devops', ['devops.filters', 'devops.services', 'devops.directives', 'devops.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'MyCtrl1'});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);
