function outer() {
	var i = 0;
	i++;
	return function () {
		return i++;
	};
}
var func = outer();
print(func());
print(func());
print(func());
