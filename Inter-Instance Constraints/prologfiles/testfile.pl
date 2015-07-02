:- multifile(test/1).

test(testfile).
test(b).
test('asd asd').
test('asdf').

versuch('asd').

testRun(X) :- test(X).
