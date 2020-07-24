import string

def generate_hashtag(s):
    if s == '' or len(s) > 140:
        return False
    else:
        return '#' + s.title().replace(' ', '')