import java.util.stream.Stream

def x = 1..6
s= x.stream()
    .filter {it-> it%2 == 0}

      .toList()
println(s)
