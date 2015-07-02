package org.projog.content_generated_at_runtime;
import org.projog.core.udp.compiler.*;
import org.projog.core.udp.interpreter.*;
import org.projog.core.udp.*;
import org.projog.core.term.*;
import org.projog.core.*;
import static org.projog.core.term.NumericTermComparator.NUMERIC_TERM_COMPARATOR;
// start/1
public final class CompiledPredicate2 implements CompiledPredicate {
   private static final boolean initRule0(final Term a0) {
      final Term v0_Stream;
      v0_Stream = a0;
      if (!Open_3.evaluate(ATOM.getTerm(), ATOM_0.getTerm(), v0_Stream.getTerm())) {
         return false;
      }
      if (!SetOutput_1.evaluate(v0_Stream.getTerm())) {
         return false;
      }
      if (!Write_1.evaluate(ATOM_1.getTerm())) {
         return false;
      }
      if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
         StaticUserDefinedPredicateFactory_1.spyPoint.logCall(StaticUserDefinedPredicateFactory_1, new Term[]{new Variable("_")});
      }
      // SingleRuleWithSingleImmutableArgumentPredicateGenerator
      final Term v0_X;
      v0_X = ATOM_2;
      if (StaticUserDefinedPredicateFactory_1.spyPoint.isEnabled()) {
         StaticUserDefinedPredicateFactory_1.spyPoint.logExit(StaticUserDefinedPredicateFactory_1, new Term[]{v0_X});
      }
      if (!Close_1.evaluate(v0_Stream.getTerm())) {
         return false;
      }
      return true;
   }
   public CompiledPredicate2(final KnowledgeBase _kb) {
      s = KnowledgeBaseUtils.getSpyPoints(_kb).getSpyPoint(new PredicateKey("start", 1));
      Open_3 = (org.projog.core.function.io.Open)_kb.getPredicateFactory(new PredicateKey("open", 3));
      SetOutput_1 = (org.projog.core.function.io.SetOutput)_kb.getPredicateFactory(new PredicateKey("set_output", 1));
      Write_1 = (org.projog.core.function.io.Write)_kb.getPredicateFactory(new PredicateKey("write", 1));
      StaticUserDefinedPredicateFactory_1 = (org.projog.core.udp.SingleRuleWithSingleImmutableArgumentPredicate)((StaticUserDefinedPredicateFactory)_kb.getPredicateFactory(new PredicateKey("test", 1))).getActualPredicateFactory();
      Close_1 = (org.projog.core.function.io.Close)_kb.getPredicateFactory(new PredicateKey("close", 1));
   }
   public final boolean evaluate(final Term... args) {
      return staticEvaluate(args[0]);
   }
   static final boolean staticEvaluate(final Term a0) {
      final boolean d = s.isEnabled();
      if (d) {
         s.logCall(CompiledPredicate2.class, new Term[]{a0});
      }
      return initRule0(a0);
   }
   public final boolean isRetryable() {
      return false;
   }
   public final boolean couldReEvaluationSucceed() {
      return false;
   }
   public final void setKnowledgeBase(KnowledgeBase kb) {
      throw new RuntimeException();
   }
   public final Predicate getPredicate(final Term... termArgs) {
      return this;
   }
   private static final Term ATOM = new Atom("outputfiles/results.txt");
   private static final Term ATOM_0 = new Atom("write");
   private static final Term ATOM_1 = new Atom("sdfs");
   private static final Term ATOM_2 = new Atom("mainfile");
   private static org.projog.core.function.io.Open Open_3;
   private static org.projog.core.function.io.SetOutput SetOutput_1;
   private static org.projog.core.function.io.Write Write_1;
   private static org.projog.core.udp.SingleRuleWithSingleImmutableArgumentPredicate StaticUserDefinedPredicateFactory_1;
   private static org.projog.core.function.io.Close Close_1;
   private static SpyPoints.SpyPoint s;
}
