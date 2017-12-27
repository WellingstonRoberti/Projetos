echo "parametros de entrada $*"
if [ $2 == "+" ]; then
let aux=$1+$3
echo "$aux"
elif [ $2 == "-" ]; then
let aux=$1-$3
echo "$aux"
elif [ $2 == "x" ]; then
let aux=$1*$3
echo "$aux"
elif [ $2 == "/" ]; then
let aux=$1/$3
echo "$aux"
elif [ $2 == "%" ]; then
let aux=$1%$3
echo "$aux"

fi
