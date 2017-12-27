dir=$1
if [ ! -d $dir ]; then
mkdir $dir
cp /home/particular-pc/* $dir
else
echo "ja existe"
fi
