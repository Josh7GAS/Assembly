function xasTable(seeds) {
    var table = [];
    table.push(seeds)
    for (var index = 1; index < 64; index++) {
        table[index]=(table[index-1]*2);
    }

    return table
}

console.log(xasTable(1));

