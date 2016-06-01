'use strict';

/* Services */

var services = angular.module('devops.services', ['ngResource']);

services.factory('UserFactory', function ($resource) {
    return $resource('/mobilerepo/rest/users', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    })
});
