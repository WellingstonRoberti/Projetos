for i in $(ls)
do
if [ -x "$i" ]&&[ -f "$i" ]; then
echo $i
fi
done
