# Smart Git Commit Script
# Handles add / modify / delete across any directory structure

git status --porcelain | ForEach-Object {

    $status = $_.Substring(0,2)
    $file = $_.Substring(3).Trim('"')

    if ($file -eq "") { return }

    Write-Host "Processing: $file"

    # Determine action type
    switch -Regex ($status) {

        "^\?\?" {
            git add -- "$file"
            $message = "add: $file"
        }

        "^ M|^M " {
            git add -- "$file"
            $message = "modify: $file"
        }

        "^ D|^D " {
            git rm -- "$file"
            $message = "delete: $file"
        }

        default {
            git add -- "$file"
            $message = "update: $file"
        }
    }

    git commit -m $message

    if ($LASTEXITCODE -eq 0) {
        git push
    }
}