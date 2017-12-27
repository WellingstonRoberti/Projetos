for i in $(ls)
do
if [ $1 "$i" ]; then
	echo $i
fi

done

