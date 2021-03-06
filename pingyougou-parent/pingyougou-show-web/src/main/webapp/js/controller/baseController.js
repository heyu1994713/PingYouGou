 app.controller('baseController',function($scope){
 				//分页kongjian
    			$scope.paginationConf={
    				 currentPage: 1,
					 totalItems: 10,
					 itemsPerPage: 10,
					 perPageOptions: [10, 20, 30, 40, 50],
					 onChange: function(){
					        	 $scope.reloadList();//重新加载
					 }
    			};
    			
    			//刷新列表
			$scope.reloadList=function(){
				$scope.search( $scope.paginationConf.currentPage ,  $scope.paginationConf.itemsPerPage );
			}
			
			
//			$scope.selectIds=[];//选中的ID集合 

			  //用户勾选list集合
                $scope.selectList=[];
                $scope.updateSelection=function($event,id){
                		if($event.target.checked){
                		  $scope.selectList.push(id)
                		}else{
                			var index=$scope.selectList.indexOf(id);
                			$scope.selectList.splice(index,1);
                		}
                 }
                
                
                $scope.jsonToString=function(jsonString,key){
                	var json=JSON.parse(jsonString);//将json字符串转换为json对象
            		var value="";
            		for(var i=0;i<json.length;i++){		
            			if(i>0){
            				value+=","
            			}
            			value+=json[i][key];			
            		}
            		return value;
            	}
                
 })
 