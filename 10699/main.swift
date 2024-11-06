import Foundation

let dataFormatter = DateFormatter()
dataFormatter.dateFormat = "yyyy-MM-dd"
print(dataFormatter.string(from: Date()))