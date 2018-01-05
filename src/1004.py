convert = {
    'cubits': 45.72,
    'feet': 30.48,
    'inches': 2.54,
    'meters': 100.0,
    'centimeters': 1.0,
}
epsilon = 1e-9
while True:
    try:
        size, unit = raw_input().strip().split()
        size_with_cm = float(size) * convert[unit]
        length = size_with_cm

        size, unit = raw_input().strip().split()
        size_with_cm = float(size) * convert[unit]
        width = size_with_cm

        size, unit = raw_input().strip().split()
        size_with_cm = float(size) * convert[unit]
        height = size_with_cm

        raw_input()
        if abs(length - width) < epsilon:
            print "Spin\n"
        elif abs(length - width * 6) < epsilon:
            print "Excellent\n"
        else:
            print "Neither\n"

    except EOFError:
        break
