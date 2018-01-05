birth = {
    'Adam': 0,
    'Seth': 1,
    'Enosh': 2,
    'Kenan': 3,
    'Mahalalel': 4,
    'Jared': 5,
    'Enoch': 6,
    'Methuselah': 7,
    'Lamech': 8,
    'Noah': 9,
    'Shem': 10,
    'Ham': 10,
    'Japheth': 10,
}

life = {
    'Adam': 930,
    'Seth': 912,
    'Enosh': 905,
    'Kenan': 910,
    'Mahalalel': 895,
    'Jared': 962,
    'Enoch': 365,
    'Methuselah': 969,
    'Lamech': 777,
    'Noah': -1,
    'Shem': -1,
    'Ham': -1,
    'Japheth': -1,
}

while True:
    try:
        a, b = raw_input().strip().split()
        print "Yes" if birth[a] < birth[b] else "No"
        if life[a] == -1 or life[b] == -1:
            print "No enough information"
        elif life[a] > life[b]:
            print "Yes"
        else:
            print "No"

    except EOFError:
        break
