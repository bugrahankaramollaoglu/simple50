for dir in */; do
	name="${dir%/}"
	file="${name#*_}.java"
	touch "$name/$file"
done
