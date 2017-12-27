dir="backupp"
if [ ! -d $dir ]; then
mkdir backup
cp /home/particular-pc/* backup
else
echo "ja existe"
fi
