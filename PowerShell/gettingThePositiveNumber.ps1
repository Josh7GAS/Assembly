#Number to be reading
[int]$number = $(Read-Host "Give me a number to read, and I'll tranform in positive.")

#Transforming the number if is negative
if ($number -lt 0) {

    $number = $number *-1

    Write-Host "the positive integer is", $number

    }else {

        Write-Host "the number is positive", $number
    }