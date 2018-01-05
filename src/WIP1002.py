import re

regex = re.compile('^(\d:\d)(\s*)(.*)$')

while True:
    try:
        line = raw_input().strip()
        match_result = regex.match(line)
        groups = re.split('[ ;:]', match_result.group(3))
        groups = [group for group in groups if len(group)]
        if not match_result:
            break
        print '{} {}'.format(
            match_result.group(1),
            len(groups))

    except EOFError:
        break
