# Git auto add, commit, push one-by-one

$files = git status --porcelain | ForEach-Object { $_.Substring(3) }

foreach ($file in $files) {

    if ($file -eq "") { continue }

    Write-Host "Processing: $file"

    git add "$file"

    $message = "Add/update $file"

    git commit -m $message

    if ($LASTEXITCODE -eq 0) {
        git push
    }
}