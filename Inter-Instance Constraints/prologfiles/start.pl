
:- [main].
:- [rules].
:- [status].
:- [externspec].

:- set_prolog_flag(verbose, silent).
:- initialization(main).


% Hier Konfigurationen. Von diesem Punkt aus startet der Modelchecker
main :-
	format('Example script~n'),
	write('run checker\n'),
	run_checker,
	write('checker completed\n'),
	halt.
main :-
    halt(1).
