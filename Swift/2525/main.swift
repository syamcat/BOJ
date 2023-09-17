import Foundation

let timeInput = readLine() ?? "Invalid input for time"
let time: [Int] = timeInput.split(separator: " ").compactMap {Int($0)}
let cookInput = readLine() ?? "Invalid input for cooking time"
let cook = Int(cookInput)!
let now = (time[0] * 60) + time[1]
let howLong = now + cook

print(((howLong / 60) % 24), (howLong % 60))