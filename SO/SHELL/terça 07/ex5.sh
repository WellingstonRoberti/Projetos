for i in $(ls)
do
if [ -x "$i" ]&&[ -f "$i" ]; then
	rm $i
fi
done

