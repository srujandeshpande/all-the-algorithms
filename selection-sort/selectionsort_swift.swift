//
//  main.swift
//  SelectionSort
//
//  Created by Shrish Deshpande on 5/16/20.
//  Copyright © 2020 Shrish Deshpande. All rights reserved.
//

import Foundation

class main{
    static var intList: [Int] = []
    static var stringIntList: [String] = []
    init() {
        print("Length")
        let _: Int = Int(readLine()!)!
        print("Elements")
        let elements: String = readLine()!
        let elementsArr: [String] = elements.split{$0 == " "}.map(String.init)
        main.intList = elementsArr.map { Int($0)!}
        for i in stride(from: main.intList.count-1, to: 0, by: -1) {
            for j in 1...i {
                if main.intList[j-1] > main.intList[j] {
                    let tmp = main.intList[j-1]
                    main.intList[j-1] = main.intList[j]
                    main.intList[j] = tmp
                }
            }
        }
        main.stringIntList = main.intList.map{String($0)}
        let intListToString: String = main.stringIntList.joined(separator:" ")
        print(intListToString)
    }
}

var initMain:main = main()

