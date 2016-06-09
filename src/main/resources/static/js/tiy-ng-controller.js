angular.module('TIYAngularApp', [])
   .controller('SampleController', function($scope, $http) {

        $scope.makeChocolate = function() {


    $http.post("/addInput.json", $scope.chocolateInput)
        .then(
            function successCallback(response) {
                console.log(response.data);
                console.log("Adding data to scope");
                $scope.madeChocolate = response.data;
            },
            function errorCallback(response) {
                console.log("Unable to get data");
            });

                    $scope.makeArray = function(arraySize) {
                        var returnArray = [];
                        for (var i = 0; i < arraySize; i++) {
                            returnArray.push(i);
                        }
                        return returnArray;
                    }



};


  });
