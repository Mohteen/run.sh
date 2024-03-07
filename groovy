echo "# run.sh" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:Mohteen/run.sh.git
git push -u origin main
