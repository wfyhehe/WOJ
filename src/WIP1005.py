sizes = [0] * 100
values = [0] * 100
result_list = [0] * 100001
while True:
    try:
        count = int(raw_input())
        for i in range(count):
            size, value = map(int, raw_input().strip().split())
            sizes[i] = size
            values[i] = value
        pack_size = int(raw_input())
        max_value = 0
        for i in range(count):
            size = sizes[i]
            value = values[i]
            for j in range(pack_size, 0, -1):
                if size <= j:
                    if i == 0:
                        result_list[j] = value
                    else:
                        new_result = result_list[j - size] + value
                        if new_result > result_list[j]:
                            result_list[j] = new_result
                else:
                    break
        print result_list[pack_size]
    except EOFError:
        break
