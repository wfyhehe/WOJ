items = []

while True:
    try:
        count = int(raw_input())
        for i in range(count):
            size, value = map(int, raw_input().strip().split())
            items.append({'size': size, 'value': value})
        pack_size = int(raw_input())
        max_value = 0
        result_list = [0] * (pack_size + 1)
        for i in range(len(items)):
            this_item = items[i]
            for j in range(pack_size, 0, -1):
                if this_item['size'] <= j:
                    if i == 0:
                        result_list[j] = this_item['value']
                    else:
                        new_result = result_list[j - this_item['size']] + this_item['value']
                        if new_result > result_list[j]:
                            result_list[j] = new_result
                else:
                    break
        print result_list[pack_size]
    except EOFError:
        break
