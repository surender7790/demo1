var myApp = angular.module('Labels',[]);

myApp.controller('LabelsController', ['$scope', function($scope) {
  $scope.greeting = 'Hola!';
        $scope.ary = [];
        $(function () {
            $('#labels tr').each(function (a, b) {
                var id = $('#labelId', b).text();
                var labelName = $('#labelName', b).text();
                var labelText = $('#labelText', b).text();
                $scope.ary.push({ id: id, name: labelName,text:labelText });
               
            });
            // lowercase string and sort it ascending order
            $scope.ary.sort(function (a, b) {
                return a.name.toLowerCase().localeCompare(b.name.toLowerCase());
            });
            $scope.$apply();
            //array for each label
            
            $('#labels').empty();
            $scope.ary.forEach(label => {
                //jquery to empty table
                $('#labels').append(`<tr th:each="label,iterStat : ${labels}"><th scope="row" th:text="${iterStat.count}"></th>
									<td th:text="${label.labelId}" id="labelId"></td>
									<td th:text="${label.labelName}" id="labelName"></td><td th:text="${label.labelText}" id="labelText"></td></tr>`);
            });


            console.log(JSON.stringify( $scope.ary));
        });
}]);