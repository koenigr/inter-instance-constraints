:- multifile(test/1).

start(Stream) :- 
	open('outputfiles/results.txt', write, Stream),
	set_output(Stream),
	write('sdfs'),
	test(X),
	close(Stream).


test(mainfile).

testRun(X) :- test(X).
