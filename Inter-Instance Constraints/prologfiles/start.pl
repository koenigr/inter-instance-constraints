:- set_prolog_flag(verbose, silent). % TODO was macht das????
:- initialization(main).

:- multifile(test/1).

:- [main].

% Hier Konfigurationen. Von diesem Punkt aus startet der Modelchecker
main :-
	format('Example script~n'),
	current_prolog_flag(argv, Argv),
	format('Called with ~q~n', [Argv]),
	write('run checker'),
	run_checker,
	halt.
main :-
    halt(1).
